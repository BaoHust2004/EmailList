package com.example.list

// MainActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Dữ liệu mẫu
        val emailList = listOf(
            Email("Nguyễn Văn A", "Hội nghị quốc tế về công nghệ AI", "Tham dự hội nghị AI vào ngày mai", "08:15 AM", 'N'),
            Email("Lê Thị B", "Giảm giá 50% cho khóa học lập trình", "Nhanh tay đăng ký khóa học!", "09:30 AM", 'L'),
            Email("Phạm Văn C", "Cập nhật phần mềm bảo mật", "Cập nhật để bảo vệ máy tính của bạn", "10:45 AM", 'P'),
            Email("Đào Thị D", "Mời tham gia hội thảo", "Tham gia hội thảo blockchain miễn phí", "11:15 AM", 'Đ'),
            Email("Trần Văn E", "Khóa học tiếng Anh giao tiếp", "Đăng ký khóa học ngay hôm nay!", "12:05 PM", 'T'),
            Email("Nguyễn Thị F", "Tuyển dụng vị trí lập trình viên", "Công ty chúng tôi cần bạn!", "01:20 PM", 'N'),
            Email("Hoàng Văn G", "Tư vấn mua nhà giá rẻ", "Xem danh sách nhà giá rẻ tại Hà Nội", "02:30 PM", 'H'),
            Email("Bùi Thị H", "Lời mời tham gia CLB đọc sách", "Tham gia CLB đọc sách với nhiều ưu đãi", "03:15 PM", 'B'),
            Email("Lâm Văn I", "Khuyến mãi đặc biệt từ Shopee", "Mua hàng với giá cực sốc", "04:40 PM", 'L'),
            Email("Phan Thị J", "Khóa học Marketing online", "Đăng ký khóa học miễn phí!", "05:25 PM", 'P'),
            Email("Đặng Văn K", "Cập nhật chính sách bảo mật", "Xem thay đổi chính sách bảo mật", "06:30 PM", 'Đ'),
            Email("Hồ Thị L", "Thư mời hội nghị y tế", "Tham dự hội nghị sức khỏe", "07:50 PM", 'H'),
            Email("Nguyễn Văn M", "Khóa học thiết kế đồ họa", "Học thiết kế đồ họa cơ bản", "08:20 PM", 'N'),
            Email("Đỗ Thị N", "Thông tin tuyển dụng", "Công ty chúng tôi đang tuyển dụng", "09:15 PM", 'Đ'),
            Email("Trần Văn O", "Sự kiện công nghệ sắp tới", "Tham gia sự kiện công nghệ lớn", "10:30 PM", 'T'),
            Email("Lý Thị P", "Khuyến mãi Tết Nguyên Đán", "Mua sắm với giá ưu đãi", "11:00 PM", 'L'),
            Email("Nguyễn Văn Q", "Thư mời hội thảo môi trường", "Tham dự hội thảo về bảo vệ môi trường", "12:00 AM", 'N'),
            Email("Phan Thị R", "Tư vấn chăm sóc da mùa hè", "Những bí quyết chăm sóc da hiệu quả", "08:00 AM", 'P'),
            Email("Bùi Văn S", "Chương trình học bổng du học", "Thông tin học bổng tại Nhật Bản", "08:45 AM", 'B'),
            Email("Lê Thị T", "Thư mời dự lễ khai trương", "Tham dự khai trương showroom mới", "09:10 AM", 'L'),
            Email("Đào Văn U", "Khóa học miễn phí cho sinh viên", "Đăng ký ngay khóa học miễn phí", "10:00 AM", 'Đ'),
            Email("Nguyễn Thị V", "Sự kiện khuyến mãi cuối năm", "Giảm giá đến 70%", "11:05 AM", 'N'),
            Email("Trần Thị W", "Cuộc thi lập trình quốc tế", "Đăng ký tham gia cuộc thi lập trình", "12:10 PM", 'T'),
            Email("Phạm Văn X", "Giới thiệu sản phẩm mới", "Sản phẩm công nghệ cao", "01:35 PM", 'P'),
            Email("Lê Thị Y", "Lời mời tham dự hội thảo tài chính", "Tham gia hội thảo tài chính miễn phí", "02:50 PM", 'L'),
            Email("Vũ Thị Z", "Cập nhật bảo mật hệ thống", "Xem chi tiết bảo mật mới", "03:20 PM", 'V'),
            Email("Hồ Văn A", "Khóa học tiếng Nhật miễn phí", "Học tiếng Nhật từ cơ bản đến nâng cao", "04:00 PM", 'H'),
            Email("Đặng Thị B", "Lời mời tham gia CLB Yoga", "Tham gia CLB Yoga với nhiều lợi ích", "05:45 PM", 'Đ'),
            Email("Lâm Văn C", "Khuyến mãi từ Lazada", "Mua sắm Tết với ưu đãi cực lớn", "06:30 PM", 'L'),
            Email("Bùi Thị D", "Thư mời hội thảo về lập trình", "Hội thảo lập trình miễn phí", "07:10 PM", 'B')
        )


        recyclerView.adapter = EmailAdapter(emailList)
    }
}
