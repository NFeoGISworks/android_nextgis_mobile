/*
 * Project:  NextGIS Mobile
 * Purpose:  Mobile GIS for Android.
 * Author:   Dmitry Baryshnikov (aka Bishop), bishop.dev@gmail.com
 * Author:   NikitaFeodonit, nfeodonit@yandex.com
 * Author:   Stanislav Petriakov, becomeglory@gmail.com
 * *****************************************************************************
 * Copyright (c) 2012-2017 NextGIS, info@nextgis.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser Public License for more details.
 *
 * You should have received a copy of the GNU Lesser Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.nextgis.libngui.util;

public interface SettingsConstantsUI
{
    String THEME_LIGHT = "light";
    String THEME_DARK  = "dark";

    // from maplib
    String KEY_PREF_MAP                     = "map";
    String KEY_PREF_MAP_PATH                = "map_path";
    String KEY_PREF_LAST_SYNC_TIMESTAMP     = "last_sync_timestamp";
    String KEY_PREF_LOCATION_SOURCE         = "location_source";
    String KEY_PREF_LOCATION_MIN_TIME       = "location_min_time";
    String KEY_PREF_LOCATION_MIN_DISTANCE   = "location_min_distance";
    String KEY_PREF_LOCATION_ACCURATE_COUNT = "accurate_max_count";
    String KEY_PREF_LOCATION_ACCURATE_TIME  = "accurate_max_time";
    String KEY_PREF_TRACKS_MIN_TIME         = "tracks_min_time";
    String KEY_PREF_TRACKS_MIN_DISTANCE     = "tracks_min_distance";
    String KEY_PREF_TRACKS_SOURCE           = "tracks_location_source";
    String KEY_PREF_TRACK_RESTORE           = "track_restore";


    // from maplibui
    String KEY_PREF_SCROLL_X   = "map_scroll_x";
    String KEY_PREF_SCROLL_Y   = "map_scroll_y";
    String KEY_PREF_ZOOM_LEVEL = "map_zoom_level";

    String KEY_PREF_KEEPSCREENON         = "keep_screen_on";
    String KEY_PREF_COORD_FORMAT         = "coordinates_format";
    String KEY_PREF_COORD_FRACTION       = "coordinates_fraction_digits";
    String KEY_PREF_SYNC_PERIODICALLY    = "sync_periodically";
    String KEY_PREF_SYNC_PERIOD          = "sync_period";
    String KEY_PREF_SYNC_PERIOD_SEC_LONG = "sync_period_sec_long";
    String KEY_PREF_SHOW_STATUS_PANEL    = "show_status_panel";
    String KEY_PREF_SHOW_CURRENT_LOC     = "show_current_location";
    String KEY_PREF_THEME                = "theme";
    String KEY_PREF_APP_FIRST_RUN        = "app_first_run";
    String KEY_PREF_MAP_NAME             = "map_name";
    String KEY_PREF_COMPASS_VIBRATE      = "compass_vibration";
    String KEY_PREF_COMPASS_TRUE_NORTH   = "compass_true_north";
    String KEY_PREF_COMPASS_MAGNETIC     = "compass_show_magnetic";
    String KEY_PREF_COMPASS_KEEP_SCREEN  = "compass_wake_lock";
    String KEY_PREF_RESET_SETTINGS       = "reset_settings";
    String KEY_PREF_MAP_BG               = "map_bg";
    String KEY_PREF_LAYER_LABEL          = "layer_label";
    String KEY_PREF_SHOW_GEO_DIALOG      = "show_geo_dialog";

    String OSM_URL = "http://{a,b,c}.tile.openstreetmap.org/{z}/{x}/{y}.png";

    /**
     * preference pages
     */
    String PREFS_SETTINGS        = "com.nextgis.mobile.PREFS_SETTINGS";
    String ACTION_PREFS_GENERAL  = "com.nextgis.mobile.PREFS_GENERAL";
    String ACTION_PREFS_MAP      = "com.nextgis.mobile.PREFS_MAP";
    String ACTION_PREFS_NGW      = "com.nextgis.mobile.PREFS_NGW";
    String ACTION_PREFS_NGID     = "com.nextgis.mobile.PREFS_NGID";
    String ACTION_PREFS_COMPASS  = "com.nextgis.mobile.PREFS_COMPASS";
    String ACTION_PREFS_TRACKING = "com.nextgis.mobile.PREFS_TRACKING";
    String ACTION_PREFS_UPDATE   = "com.nextgis.mobile.PREFS_UPDATE";
    String ACTION_PREFS_LOCATION = "com.nextgis.mobile.PREFS_LOCATION";
    String ACTION_PREFS_EDIT     = "com.nextgis.mobile.PREFS_EDIT";
    String ACTION_ACCOUNT        = "com.nextgis.mobile.ACCOUNT";
}
