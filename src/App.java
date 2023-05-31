

import javafx.application.Application;

import javafx.stage.Stage;

public class App extends Application{

    public static void main(String[] args) throws Exception {
        MyLogger.LoggerConfig();
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        final GUI gui = new GUI(stage);
        stage.setOnCloseRequest(event -> {
            NewBoard.stopThreads();
        });

        
    }
}


