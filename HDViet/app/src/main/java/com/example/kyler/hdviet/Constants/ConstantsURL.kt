package com.example.kyler.hdviet.Constants

/**
 * Created by kyler on 29/06/2017.
 */

object ConstantsURL {
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

    object Genre{
        open val populars                   = 0
        open val series                     = 1
        open val movies                     = 2
    }

    object HeaderKeys{
        open val accessToken                = "Access-Token"
    }

    object QueryKeys{
        open val genre                      = "genre"
        open val tag                        = "tag"
        open val page                       = "page"
        open val limit                      = "limit"
    }

    object Tags{
        open val moi_cap_nhat			    = "Mới cập nhật"
        open val hot_trong_thang			= "Hot trong tháng"
        open val hdviet_de_cu			    = "HDViệt đề cử"
        open val hanh_dong			        = "Hành động"
        open val kinh_di			        = "Kinh dị"
        open val hai			            = "Hài"
        open val chien_tranh			    = "Chiến tranh"
        open val khoa_hoc_vien_tuong		= "Khoa học viễn tưởng"
        open val hinh_su_toi_pham			= "Hình sự tội phạm"
        open val vo_thuat			        = "Võ thuật"
        open val tinh_cam			        = "Tình cảm"
        open val hoat_hinh			        = "Hoạt hình"
        open val anime			            = "Anime"
        open val am_nhac			        = "Âm nhạc"
        open val the_thao			        = "Thể thao"
        open val tam_ly			            = "Tâm lý"
        open val au_my			            = "Âu mỹ"
        open val gia_dinh			        = "Gia đình"
        open val chau_a			            = "Châu á"
        open val hong_kong			        = "Hồng kông"
        open val han_quoc			        = "Hàn quốc"
        open val lich_su			        = "Lịch sử"
        open val tai_lieu			        = "Tài liệu"
        open val chieu_rap			        = "Phim chiếu rạp"
        open val bi_an			            = "Phim bí ẩn"
        open val co_trang			        = "Phim cổ trang"
        open val lang_man			        = "Phim lãng mạn"
        open val trinh_tham			        = "Phim trinh thám"
        open val vien_tay			        = "Phim viễn tây"
        open val sap_chieu			        = "Sắp chiếu"
        open val than_thoai			        = "Thần thoại"
    }
}
