module example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens example.demo to javafx.fxml;
//    phải open model vào
    opens model to javafx.base, com.google.gson;
    exports example.demo;
}