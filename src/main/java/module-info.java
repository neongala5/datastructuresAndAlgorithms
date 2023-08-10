module com.example.datastructuresandalgorithms {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.datastructuresandalgorithms to javafx.fxml;
    exports com.example.datastructuresandalgorithms;
}