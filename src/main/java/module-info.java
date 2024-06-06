module example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens example.demo to javafx.fxml;
//    phải open model vào
    opens model to javafx.base;
    exports example.demo;
}