/*
 * Copyright (C) 2016 Brian Wernick
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.devbrackets.android.exomedia.listener;

import com.devbrackets.android.exomedia.manager.EMPlaylistManager;
import com.devbrackets.android.exomedia.service.EMPlaylistService;

/**
 * Basic AudioFocus callbacks.  These can also be accessed through
 * their corresponding EventBus events.
 *
 * @deprecated The {@link EMPlaylistService}, {@link EMPlaylistManager}, and associated helpers will be removed in the next
 * major release (3.0).  Instead the Playlist functionality has been extracted in to a separate library called
 * <a href="https://github.com/brianwernick/PlaylistCore">PlaylistCore</a>
 */
@Deprecated
public interface EMAudioFocusCallback {
    /**
     * Occurs when the application gains audio focus.
     * You can also catch this event with the EventBus event
     * {@link com.devbrackets.android.exomedia.event.EMAudioFocusGainedEvent}
     *
     * @return True if the event has been handled
     */
    boolean onAudioFocusGained();

    /**
     * Occurs when the application looses audio focus.
     * You can also catch this event with the EventBus event
     * {@link com.devbrackets.android.exomedia.event.EMAudioFocusLostEvent}
     *
     * @return True if the event has been handled
     */
    boolean onAudioFocusLost(boolean canDuckAudio);
}
