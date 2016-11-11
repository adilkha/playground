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

package io.novaordis.playground.java.xml.dom;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * @author Ovidiu Feodorov <ovidiu@novaordis.com>
 * @since 11/9/16
 */
public class ErrorHandlerImpl implements ErrorHandler {

    // Constants -------------------------------------------------------------------------------------------------------

    // Static ----------------------------------------------------------------------------------------------------------

    // Attributes ------------------------------------------------------------------------------------------------------

    // Constructors ----------------------------------------------------------------------------------------------------

    // ErrorHandler implementation -------------------------------------------------------------------------------------

    @Override
    public void warning(SAXParseException exception) throws SAXException {
        throw new RuntimeException("warning() NOT YET IMPLEMENTED");
    }

    @Override
    public void error(SAXParseException exception) throws SAXException {
        throw new RuntimeException("error() NOT YET IMPLEMENTED");
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {
        throw new RuntimeException("fatalError() NOT YET IMPLEMENTED");
    }

    // Public ----------------------------------------------------------------------------------------------------------

    // Package protected -----------------------------------------------------------------------------------------------

    // Protected -------------------------------------------------------------------------------------------------------

    // Private ---------------------------------------------------------------------------------------------------------

    // Inner classes ---------------------------------------------------------------------------------------------------

}
