module com.carlos.datastructuresandalgorithms {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.carlos.datastructuresandalgorithms to javafx.fxml;
    exports com.carlos.datastructuresandalgorithms;
}