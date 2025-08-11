module poros.podmaoil {
    requires javafx.controls;
    requires javafx.fxml;


    opens poros.podmaoil to javafx.fxml;
    exports poros.podmaoil;
}