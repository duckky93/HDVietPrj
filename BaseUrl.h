//
//  BaseUrl.h
//  HDVietFree
//
//  Created by Bao (Brian) L. LE on 1/25/16.
//  Copyright © 2016 Brian. All rights reserved.
//

#ifndef BaseUrl_h
#define BaseUrl_h

// Base Url
#define kBaseUrlSSL @"https://api-v2.hdviet.com/"
#define kBaseUrl @"http://rest.hdviet.com/"
#define kUrlHdViet @"http://movies.hdviet.com/"
#define kUrlImagePosterHdViet @"http://t.hdviet.com/thumbs/origins/%@"
#define kUrlImageBannerHdViet @"http://t.hdviet.com/backdrops/origins/%@"
#define kUrlHttpTHdViet @"t.hdviet.com"
#define kUrlTvChannelHTVOnline @"http://api.htvonline.com.vn/tv_channels"

// List api
#define kUrlAllSeason @"movie/getallseason?movieid=%@"
#define kUrlLogin @"user/login?email=%@&password=%@"
#define kUrlCategory @"category/menu?mini=1&sequence=%d"
#define kUrlDetailMovie @"movie?movieid=%@"
#define kUrlListMovieByGenre @"api/v3/movie/filter?genre=%d&tag=%@&page=%d&limit=0"
#define kUrlPlayMovie @"movie/play?movieid=%@&accesstokenkey=%@&ep=%d"
#define kUrlSearchMovieWithKeyword @"api/v3/search?keyword=%@&page=1&limit=100"
#define kUrlGetAllCategory @"category"

// Google spread sheet for report bug
#define kUrlGoogleReportBug @"https://docs.google.com/forms/d/1n9xqo59r-cyzvq5NudccyHbDS5m9QhpdongRz-buFsk/formResponse"
#define kRegisterUrl @"https://id.hdviet.com/dang-ki-moi?token=dXJsPWh0dHA6Ly9tb3ZpZXMuaGR2aWV0LmNvbSYmdXJsX3JlZGlyZWN0PWh0dHA6Ly9tb3ZpZXMuaGR2aWV0LmNvbQ=="

#endif /* BaseUrl_h */

#define kDicMainMenu [[NSDictionary alloc] initWithObjectsAndKeys: 
@"Mới cập nhật", @"moi-cap-nhat", 
@"Hot trong tháng", @"hot-trong-thang", 
@"HDViệt đề cử", @"hdviet-de-cu", 
@"Hành động", @"hanh-dong", 
@"Kinh dị", @"kinh-di", 
@"Hài", @"hai", 
@"Chiến tranh", @"chien-tranh", 
@"Khoa học viễn tưởng", @"khoa-hoc-vien-tuong", 
@"Hình sự tội phạm", @"hinh-su-toi-pham", 
@"Võ thuật", @"vo-thuat", 
@"Tình cảm", @"tinh-cam", 
@"Hoạt hình", @"hoat-hinh", 
@"Anime", @"anime", 
@"Hoạt hình", @"hoat-hinh", 
@"Âm nhạc", @"am-nhac", 
@"Thể thao", @"the-thao", 
@"Tâm lý", @"tam-ly", 
@"Âu mỹ", @"au-my", 
@"Gia đình", @"gia-dinh", 
@"Châu á", @"chau-a", 
@"Hồng kông", @"hong-kong", 
@"Hàn quốc", @"han-quoc", 
@"Lịch sử", @"lich-su", 
@"Tài liệu", @"tai-lieu", 
@"Phim chiếu rạp", @"chieu-rap", 
@"Phim bí ẩn", @"bi-an", 
@"Phim cổ trang", @"co-trang", 
@"Phim lãng mạn", @"lang-man", 
@"Phim trinh thám", @"trinh-tham", 
@"Phim viễn tây", @"vien-tay", 
@"Phim chiếu rạp", @"chieu-rap", 
@"Sắp chiếu", @"sap-chieu", 
@"Thần thoại", @"than-thoai", nil]// 

Dict for main menu#define kDicMainMenuPhimBo [[NSDictionary alloc] initWithObjectsAndKeys: 
@"Mới cập nhật", @"moi-cap-nhat", 
@"Hot trong tháng", @"hot-trong-thang", 
@"HDViệt đề cử", @"hdviet-de-cu", 
@"Hành động", @"hanh-dong", 
@"Kinh dị", @"kinh-di", 
@"Hài", @"hai", 
@"Chiến tranh", @"chien-tranh", 
@"Khoa học viễn tưởng", @"khoa-hoc-vien-tuong", 
@"Hình sự tội phạm", @"hinh-su-toi-pham", 
@"Võ thuật", @"vo-thuat", 
@"Tình cảm", @"tinh-cam", 
@"Hoạt hình", @"hoat-hinh", 
@"Anime", @"anime", 
@"Hoạt hình", @"hoat-hinh", 
@"Âm nhạc", @"am-nhac", 
@"Thể thao", @"the-thao", 
@"Tâm lý", @"tam-ly", 
@"Âu mỹ", @"au-my", 
@"Gia đình", @"gia-dinh", 
@"Châu á", @"chau-a", 
@"Hồng kông", @"hong-kong", 
@"Hàn quốc", @"han-quoc", 
@"Lịch sử", @"lich-su", 
@"Tài liệu", @"tai-lieu", 
@"Phim bí ẩn", @"bi-an", 
@"Phim cổ trang", @"co-trang", 
@"Phim lãng mạn", @"lang-man", 
@"Phim trinh thám", @"trinh-tham", 
@"Phim viễn tây", @"vien-tay", 
@"Thần thoại", @"than-thoai", nil]

Sent on:9:02 amFrom:
kGenrePhimHot = 0,
kGenrePhimLe = 1,
kGenrePhimBo = 2,
