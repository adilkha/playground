/*
 * Copyright (c) 2016 Nova Ordis LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.novaordis.playground.jee.servlet.session.plumbing.command;

import io.novaordis.playground.jee.servlet.session.plumbing.Context;

/**
 * @author Ovidiu Feodorov <ovidiu@novaordis.com>
 * @since 6/9/16
 */
public abstract class CommandBase implements Command {

    // Constants -------------------------------------------------------------------------------------------------------

    // Static ----------------------------------------------------------------------------------------------------------

    // Attributes ------------------------------------------------------------------------------------------------------

    private Context context;
    private String argumentPath;

    // Constructors ----------------------------------------------------------------------------------------------------

    protected CommandBase(Context context) {

        this(context, null);
    }

    protected CommandBase(Context context, String argumentPath) {
        this.context = context;
        this.argumentPath = argumentPath;
    }

    // Command implementation ------------------------------------------------------------------------------------------

    @Override
    public Context getContext() {

        return context;
    }

    // Public ----------------------------------------------------------------------------------------------------------

    // Package protected -----------------------------------------------------------------------------------------------

    // Protected -------------------------------------------------------------------------------------------------------

    // Private ---------------------------------------------------------------------------------------------------------

    // Inner classes ---------------------------------------------------------------------------------------------------

}
