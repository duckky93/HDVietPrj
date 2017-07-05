package com.example.kyler.hdviet.Constants

/**
 * Created by kyler on 29/06/2017.
 */

object ConstantsURL {

    open val ID_DATA                        = "ID_DATA"

    object Base {
        open val URL                        = "http://rest.hdviet.com/"
        open val URL_SSL                    = "https://api-v2.hdviet.com/"
        open val URL_HDVIET                 = "http://movies.hdviet.com/"
        open val URL_IMAGE_POSTER           = "http://t.hdviet.com/thumbs/origins/"
        open val URL_IMAGE_BANNER           = "http://t.hdviet.com/backdrops/origins/"
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

    enum class Genre(val key : String){
        populars("0"),
        series("1"),
        movies("2");
    }

    object HeaderKeys{
        open val accessToken                = "Access-Token"
    }

    object QueryKeys{
        open val movieId                    = "movieid"
        open val genre                      = "genre"
        open val tag                        = "tag"
        open val page                       = "page"
        open val limit                      = "limit"
    }

    enum class Tags(val key : String){
        moi_cap_nhat			    ("Mới cập nhật"),
        hot_trong_thang			    ("Hot trong tháng"),
        hdviet_de_cu			    ("HDViệt đề cử"),
        hanh_dong			        ("Hành động"),
        kinh_di			            ("Kinh dị"),
        hai			                ("Hài"),
        chien_tranh			        ("Chiến tranh"),
        khoa_hoc_vien_tuong		    ("Khoa học viễn tưởng"),
        hinh_su_toi_pham			("Hình sự tội phạm"),
        vo_thuat			        ("Võ thuật"),
        tinh_cam			        ("Tình cảm"),
        hoat_hinh			        ("Hoạt hình"),
        anime			            ("Anime"),
        am_nhac			            ("Âm nhạc"),
        the_thao			        ("Thể thao"),
        tam_ly			            ("Tâm lý"),
        au_my			            ("Âu mỹ"),
        gia_dinh			        ("Gia đình"),
        chau_a			            ("Châu á"),
        hong_kong			        ("Hồng kông"),
        han_quoc			        ("Hàn quốc"),
        lich_su			            ("Lịch sử"),
        tai_lieu			        ("Tài liệu"),
        chieu_rap			        ("Phim chiếu rạp"),
        bi_an			            ("Phim bí ẩn"),
        co_trang			        ("Phim cổ trang"),
        lang_man			        ("Phim lãng mạn"),
        trinh_tham			        ("Phim trinh thám"),
        vien_tay			        ("Phim viễn tây"),
        sap_chieu			        ("Sắp chiếu"),
        than_thoai			        ("Thần thoại")
    }
}
