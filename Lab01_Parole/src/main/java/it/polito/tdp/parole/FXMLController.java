package it.polito.tdp.parole;

import it.polito.tdp.parole.model.*;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

	@FXML
	private TextArea txtPrestazioni;
	 
    @FXML
    private ResourceBundle resources;
    
    @FXML
    private Button btnCancella;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	Long start = System.nanoTime();
    	elenco.addParola(txtParola.getText());
    	txtResult.setText(elenco.getElenco().toString());
    	txtParola.clear();
    	Long end = System.nanoTime() - start;
    	txtPrestazioni.setText("tempo per inserire la parola: " + end.toString() + "nanosecondi");
    }

    @FXML
    void doReset(ActionEvent event) {
    	Long start = System.nanoTime();
    	elenco.reset();
    	txtResult.clear();
    	txtParola.clear();
    	Long end = System.nanoTime() - start;
    	txtPrestazioni.setText("tempo per resettare: " + end.toString() + "nanosecondi");
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	Long start = System.nanoTime();
    	elenco.cancella(txtResult.getSelectedText());
    	txtResult.setText(elenco.getElenco().toString());
    	Long end = System.nanoTime() - start;
    	txtPrestazioni.setText("tempo per cancellare la parola: " + end.toString() + "nanosecondi");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
