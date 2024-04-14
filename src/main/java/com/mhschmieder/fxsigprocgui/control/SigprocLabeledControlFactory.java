/**
 * MIT License
 *
 * Copyright (c) 2020, 2024 Mark Schmieder
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * This file is part of the FxSigProcGui Library
 *
 * You should have received a copy of the MIT License along with the
 * FxSigProcGui Library. If not, see <https://opensource.org/licenses/MIT>.
 *
 * Project: https://github.com/mhschmieder/fxsigprocgui
 */
package com.mhschmieder.fxsigprocgui.control;

import com.mhschmieder.fxguitoolkit.control.XToggleButton;

public class SigprocLabeledControlFactory {

    // NOTE: We must substitute "." for resource directory tree delimiters.
    @SuppressWarnings("nls") public static final String BUNDLE_NAME =
                                                                    "properties.SigprocActionLabels";

    /**
     * The default constructor is disabled, as this is a static factory class.
     */
    private SigprocLabeledControlFactory() {}


    public static XToggleButton getPolarityToggleButton( final boolean applyAspectRatio,
                                                         final boolean selected ) {
        final String selectedText = "Reversed"; //$NON-NLS-1$
        final String deselectedText = "Normal"; //$NON-NLS-1$
        final String tooltipText = "Click to Toggle Polarity Status Between Normal and Reversed"; //$NON-NLS-1$

        // NOTE: JavaFX CSS automatically darkens unselected buttons, and
        // auto-selects the foreground for text fill; we use a custom fill.
        final XToggleButton toggleButton = new XToggleButton( selectedText,
                                                              deselectedText,
                                                              tooltipText,
                                                              "polarity-toggle", //$NON-NLS-1$
                                                              applyAspectRatio,
                                                              3.0d,
                                                              false,
                                                              selected );

        return toggleButton;
    }

    public static XToggleButton getMuteToggleButton( final boolean applyAspectRatio,
                                                     final boolean selected ) {
        final String selectedText = "Muted"; //$NON-NLS-1$
        final String deselectedText = "Mute"; //$NON-NLS-1$
        final String tooltipText = "Click to Toggle Mute Status Between Muted and Unmuted"; //$NON-NLS-1$

        // NOTE: JavaFX CSS automatically darkens unselected buttons, and
        // auto-selects the foreground for text fill; we use a custom fill.
        final XToggleButton toggleButton = new XToggleButton( selectedText,
                                                              deselectedText,
                                                              tooltipText,
                                                              "mute-toggle", //$NON-NLS-1$
                                                              applyAspectRatio,
                                                              3.0d,
                                                              false,
                                                              selected );

        return toggleButton;
    }
}
