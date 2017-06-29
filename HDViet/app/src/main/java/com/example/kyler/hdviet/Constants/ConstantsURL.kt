package com.example.kyler.hdviet.Constants

/**
 * Created by kyler on 29/06/2017.
 */

object ConstantsURL {
    object Base {
        open val URL                        = "http://rest.hdviet.com/"
        open val URL_SSL                    = "https://api-v2.hdviet.com/"
        open val URL_HDVIET                 = "http://movies.hdviet.com/"
        open val URL_IMAGE_POSTER           = "http://t.hdviet.com/thumbs/origins/%@"
        open val URL_IMAGE_BANNER           = "http://t.hdviet.com/backdrops/origins/%@"
        open val URL_HTTPT_HDVIET           = "t.hdviet.com"
        open val URL_TV_CHANNEL_HTVONLINE   = "http://api.htvonline.com.vn/tv_channels"
    }

    object Api {
        open val ALL_SEASON                 = "movie/getallseason"
        open val LOGIN                      = "user/login"
        open val CATEGORY                   = "category/menu"
        open val ALL_CATEGORY               = "category"
        open val MOVIE_DETAIL               = "movie"
        open val LIST_MOVIE_BY_GENRE        = "api/v3/movie/filter"
        open val PLAY_MOVIE                 = "movie/play"
        open val SEARCH_MOVIE               = "api/v3/search"
    }
}
