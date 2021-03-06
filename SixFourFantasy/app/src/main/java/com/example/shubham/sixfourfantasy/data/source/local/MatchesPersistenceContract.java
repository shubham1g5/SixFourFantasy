package com.example.shubham.sixfourfantasy.data.source.local;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

import com.example.shubham.sixfourfantasy.BuildConfig;

public class MatchesPersistenceContract {

    public static final String CONTENT_AUTHORITY = BuildConfig.APPLICATION_ID;
    private static final String CONTENT_SCHEME = "content://";
    public static final Uri BASE_CONTENT_URI = Uri.parse(CONTENT_SCHEME + CONTENT_AUTHORITY);
    private static final String SEPARATOR = "/";

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private MatchesPersistenceContract() {
    }

    public static abstract class MatchEntry implements BaseColumns {

        public static final String TABLE_NAME = "match";

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(TABLE_NAME).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + SEPARATOR + CONTENT_AUTHORITY + SEPARATOR + TABLE_NAME;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + SEPARATOR + CONTENT_AUTHORITY + SEPARATOR + TABLE_NAME;

        public static final String COL_MATCH_ID = "match_id";
        public static final String COL_NAME = "name";
        public static final String COL_TEAM1_ID = "team1_id";
        public static final String COL_TEAM2_ID = "team2_id";
        public static final String COL_IS_WOMEN = "is_women";
        public static final String COL_STATUS = "status";
        public static final String COL_VENUE = "venue";
        public static final String COL_SERIES = "series";
        public static final String COL_START_TIME = "start_time";
        public static final String COL_WINNING_TEAM_ID = "winning_team_id";
        public static final String COL_RESULT = "result";
        public static final String COL_TEAM1_SCORE = "team1_score";
        public static final String COL_TEAM2_SCORE = "team2_score";
        public static final String COL_FORMAT = "format";
        public static final String COL_SERIES_ID = "series_id";
        public static final String COL_IS_ABONDONED = "is_abondoned";


        public static String[] MATCHES_COLUMNS = new String[]{
                COL_MATCH_ID,
                COL_NAME,
                COL_TEAM1_ID,
                COL_TEAM2_ID,
                COL_IS_WOMEN,
                COL_STATUS,
                COL_VENUE,
                COL_SERIES,
                COL_START_TIME,
                COL_WINNING_TEAM_ID,
                COL_RESULT,
                COL_TEAM1_SCORE,
                COL_TEAM2_SCORE,
                COL_FORMAT,
                COL_SERIES_ID,
                COL_IS_ABONDONED
        };

        public static int COL_MATCH_ID_INDEX = 0;
        public static int COL_NAME_INDEX = 1;
        public static int COL_TEAM1_ID_INDEX = 2;
        public static int COL_TEAM2_ID_INDEX = 3;
        public static int COL_IS_WOMEN_INDEX = 4;
        public static int COL_STATUS_INDEX = 5;
        public static int COL_VENUE_INDEX = 6;
        public static int COL_SERIES_INDEX = 7;
        public static int COL_START_TIME_INDEX = 8;
        public static int COL_WINNING_TEAM_ID_INDEX = 9;
        public static int COL_RESULT_INDEX = 10;
        public static int COL_TEAM1_SCORE_INDEX = 11;
        public static int COL_TEAM2_SCORE_INDEX = 12;
        public static int COL_FORMAT_INDEX = 13;
        public static int COL_SERIES_ID_INDEX = 14;
        public static int COL_IS_ABONDONE_INDEX = 15;


        public static Uri buildMatchesUriWith(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }

        public static Uri buildMatchesUriWith(String id) {
            return CONTENT_URI.buildUpon().appendPath(id).build();
        }
    }

    public static abstract class RunEntry implements BaseColumns {

        public static final String TABLE_NAME = "run";

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(TABLE_NAME).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + SEPARATOR + CONTENT_AUTHORITY + SEPARATOR + TABLE_NAME;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + SEPARATOR + CONTENT_AUTHORITY + SEPARATOR + TABLE_NAME;


        public static final String COL_MATCH_ID = "match_id";
        public static final String COL_INNINGS_NO = "innings_no";
        public static final String COL_PLAYER_ID = "player_id";
        public static final String COL_RUNS = "runs";
        public static final String COL_BALLS = "balls";
        public static final String COL_FOURS = "fours";
        public static final String COL_SIXES = "sixes";
        public static final String COL_STRIKE_RATE = "strike_rate";
        public static final String COL_FOW = "fow";
        public static final String COL_OUT = "out";

        public static String[] RUNS_COLUMNS = new String[]{
                COL_MATCH_ID,
                COL_INNINGS_NO,
                TABLE_NAME + "." + COL_PLAYER_ID,
                COL_RUNS,
                COL_BALLS,
                COL_FOURS,
                COL_SIXES,
                COL_STRIKE_RATE,
                COL_FOW,
                COL_OUT};

        public static int COL_MATCH_ID_INDEX = 0;
        public static int COL_INNINGS_NO_INDEX = 1;
        public static int COL_PLAYER_ID_INDEX = 2;
        public static int COL_RUNS_INDEX = 3;
        public static int COL_BALLS_INDEX = 4;
        public static int COL_FOURS_INDEX = 5;
        public static int COL_SIXES_INDEX = 6;
        public static int COL_STRIKE_RATE_INDEX = 7;
        public static int COL_FOW_INDEX = 8;
        public static int COL_OUT_INDEX = 9;


        public static Uri buildRunsUriWith(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }

        public static Uri buildRunsUriWith(String id) {
            return CONTENT_URI.buildUpon().appendPath(id).build();
        }

    }

    public static abstract class WicketEntry implements BaseColumns {

        public static final String TABLE_NAME = "wicket";

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(TABLE_NAME).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + SEPARATOR + CONTENT_AUTHORITY + SEPARATOR + TABLE_NAME;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + SEPARATOR + CONTENT_AUTHORITY + SEPARATOR + TABLE_NAME;

        public static final String COL_MATCH_ID = "match_id";
        public static final String COL_INNINGS_NO = "innings_no";
        public static final String COL_PLAYER_ID = "player_id";
        public static final String COL_RUNS = "runs";
        public static final String COL_OVERS = "overs";
        public static final String COL_MAIDEN = "maiden";
        public static final String COL_WICKETS = "wickets";
        public static final String COL_ECONOMY = "economy";
        public static final String COL_NO_BALLS = "no_balls";
        public static final String COL_WIDE_BALLS = "wide_balls";

        public static String[] WICKETS_COLUMNS = new String[]{
                COL_MATCH_ID,
                COL_INNINGS_NO,
                TABLE_NAME + "." + COL_PLAYER_ID,
                COL_RUNS,
                COL_OVERS,
                COL_MAIDEN,
                COL_WICKETS,
                COL_ECONOMY,
                COL_NO_BALLS,
                COL_WIDE_BALLS};

        public static int COL_MATCH_ID_INDEX = 0;
        public static int COL_INNINGS_NO_INDEX = 1;
        public static int COL_PLAYER_ID_INDEX = 2;
        public static int COL_RUNS_INDEX = 3;
        public static int COL_OVERS_INDEX = 4;
        public static int COL_MAIDEN_INDEX = 5;
        public static int COL_WICKETS_INDEX = 6;
        public static int COL_ECONOMY_INDEX = 7;
        public static int COL_NO_BALLS_INDEX = 8;
        public static int COL_WIDE_BALLS_INDEX = 9;


        public static Uri buildWicketsUriWith(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }

        public static Uri buildWicketsUriWith(String id) {
            return CONTENT_URI.buildUpon().appendPath(id).build();
        }

    }

    public static abstract class TeamEntry implements BaseColumns {

        public static final String TABLE_NAME = "team";

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(TABLE_NAME).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + SEPARATOR + CONTENT_AUTHORITY + SEPARATOR + TABLE_NAME;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + SEPARATOR + CONTENT_AUTHORITY + SEPARATOR + TABLE_NAME;

        public static final String COL_TEAM_ID = "team_id";
        public static final String COL_NAME = "name";
        public static final String COL_IMAGE = "image";
        public static final String COL_SYMBOL = "symbol";

        public static String[] TEAMS_COLUMNS = new String[]{
                COL_TEAM_ID,
                COL_NAME,
                COL_IMAGE,
                COL_SYMBOL};

        public static int COL_TEAM_ID_INDEX = 0;
        public static int COL_NAME_INDEX = 1;
        public static int COL_IMAGE_INDEX = 2;
        public static int COL_SYMBOL_INDEX = 3;

        public static Uri buildTeamsUriWith(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }

        public static Uri buildTeamsUriWith(String id) {
            return CONTENT_URI.buildUpon().appendPath(id).build();
        }

    }

    public static abstract class PlayerEntry implements BaseColumns {

        public static final String TABLE_NAME = "player";

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(TABLE_NAME).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + SEPARATOR + CONTENT_AUTHORITY + SEPARATOR + TABLE_NAME;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + SEPARATOR + CONTENT_AUTHORITY + SEPARATOR + TABLE_NAME;

        public static final String COL_PLAYER_ID = "player_id";
        public static final String COL_NAME = "name";
        public static final String COL_IMAGE = "image";
        public static final String COL_TYPE = "type";


        public static String[] PLAYERS_COLUMNS = new String[]{
                COL_NAME,
                COL_IMAGE,
                COL_TYPE};

        public static int COL_NAME_INDEX = 1;
        public static int COL_IMAGE_INDEX = 2;
        public static int COL_TYPE_INDEX = 3;

        public static Uri buildPlayersUriWith(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }

        public static Uri buildPlayersUriWith(String id) {
            return CONTENT_URI.buildUpon().appendPath(id).build();
        }

    }

    public static abstract class TeamHasPlayerEntry implements BaseColumns {

        public static final String TABLE_NAME = "team_has_palyer";

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(TABLE_NAME).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + SEPARATOR + CONTENT_AUTHORITY + SEPARATOR + TABLE_NAME;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + SEPARATOR + CONTENT_AUTHORITY + SEPARATOR + TABLE_NAME;

        public static final String COL_TEAM_ID = "team_id";
        public static final String COL_PLAYER_ID = "player_id";


        public static String[] TEAM_HAS_PLAYERS_COLUMNS = new String[]{
                TeamHasPlayerEntry._ID,
                COL_TEAM_ID,
                COL_PLAYER_ID};

        public static Uri buildTeamHasPlayersUriWith(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }

        public static Uri buildTeamHasPlayersUriWith(String id) {
            return CONTENT_URI.buildUpon().appendPath(id).build();
        }
    }
}
