
package lk.ijse.ijsebillingsystem.view.util;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 *
 * @author suuti
 */
public class Transition {

    private Node node;
    public FadeTransition ft;
    
    public Transition(Node node) {
        FadeTransition ft = new FadeTransition(Duration.millis(1000));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }   

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public FadeTransition getFt() {
        return ft;
    }

    public void setFt(FadeTransition ft) {
        this.ft = ft;
    }

   
}
