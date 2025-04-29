module lii.autotextprocessor4dataflow {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.logging;


    exports lii.autotextprocessor4dataflow.controller;
    opens lii.autotextprocessor4dataflow.controller to javafx.fxml;
    exports lii.autotextprocessor4dataflow;
    opens lii.autotextprocessor4dataflow to javafx.fxml;
}