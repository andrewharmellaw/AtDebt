/*
 * @Debt Copyright (C) 2010 Andrew Harmel-Law
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * To contact the development team, please refer to the project site at:
 *
 *      http://kenai.com/projects/csdutilities
 */
package hudson.plugins.debt.dashboard;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;
import hudson.model.Descriptor;
import hudson.plugins.analysis.core.AbstractProjectAction;
import hudson.plugins.analysis.dashboard.AbstractWarningsTablePortlet;
import hudson.plugins.view.dashboard.DashboardPortlet;

import hudson.plugins.debt.DebtProjectAction;

/**
 * A portlet that shows a table with the number of warnings in a job.
 *
 * @author Ulli Hafner
 * @author Andrew Harmel-Law
 */
public class WarningsTablePortlet extends AbstractWarningsTablePortlet {

    /**
     * Creates a new instance of {@link WarningsTablePortlet}.
     *
     * @param name the name of the portlet
     */
    @DataBoundConstructor
    public WarningsTablePortlet(final String name) {
        super(name);
    }

    /** {@inheritDoc} */
    @Override
    protected Class<? extends AbstractProjectAction<?>> getAction() {
        return DebtProjectAction.class;
    }

    /** {@inheritDoc} */
    @Override
    protected String getPluginName() {
        return "debt";
    }

    /**
     * Extension point registration.
     */
    @Extension(optional = true)
    public static class WarningsPerJobDescriptor extends Descriptor<DashboardPortlet> {
        @Override
        public String getDisplayName() {
//            return Messages.Portlet_WarningsTable();
            return "";
        }
    }
}

