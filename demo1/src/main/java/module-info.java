module com.joy.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.joy.demo1 to javafx.fxml;
    exports com.joy.demo1;
}