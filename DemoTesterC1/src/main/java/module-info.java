module com.dstuan.demotesterc1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dstuan.demotesterc1 to javafx.fxml;
    exports com.dstuan.demotesterc1;
}
