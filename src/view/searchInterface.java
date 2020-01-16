package view;

import application.Photos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class searchInterface {
    @FXML
    private ListView list_view;
    @FXML
    private Button create_album;
    @FXML
    private TextField album_field;
    @FXML
    private Button exit_search;
    @FXML
    private Button open_image;
    @FXML
    private TextArea album_details;

    public void createAlbum(ActionEvent actionEvent) {
    }

    public void openImage(ActionEvent actionEvent) {
    }
    public void getData(){
//      nonAdminInterface.startDate;
//      nonAdminInterface.endDate;
//      nonAdminInterface.tagType;
//      nonAdminInterface.tagValue;
//
//      HashMap<String, ArrayList<Photo>> tempAlbums = tempHash.get(newUser.getUsername());
//      Iterator it2 = tempAlbums.entrySet().iterator();
//      while (it2.hasNext()) {
//          HashMap.Entry pair2 = (HashMap.Entry) it2.next();
//          //System.out.println("key: " + pair2.getKey());
//          //System.out.println("values: " + pair2.getValue());
//          //newUser.setHashAlbum((String)pair2.getKey());
//          newUser.photoAlbums.get(newUser.getUsername())
//                  .put((String) pair2.getKey(), // album names
//                          (ArrayList<Photo>) pair2.getValue() // album arraylist photos
//                  );
//
//      }
  }
    public void exitSearch(ActionEvent actionEvent) {
        Photos.switchScenes("../view/nonAdminUI.fxml", exit_search);
//        try {
//            Photos photo = new Photos();
//
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("nonAdminUI.fxml"));
//            loader.setLocation(getClass().getResource("nonAdminUI.fxml"));
//            Stage stage = (Stage) exit_search.getScene().getWindow();
//            Scene scene = new Scene(loader.load());
//            stage.setScene(scene);
////	        if (currUser.equals("admin"))
//        } catch (IOException io) {
//            io.printStackTrace();
//        }
        //add logic to save work below
    }
}
