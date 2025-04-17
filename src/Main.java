import controller.FaculdadeController;
import model.Faculdade;
import view.FalculdadeView;

public class Main {
    public static void main(String[] args) {
        FalculdadeView view = new FalculdadeView();
        Faculdade faculdade = new Faculdade("UFMS");


        FaculdadeController controller = new FaculdadeController(faculdade,view);
        controller.inicializar();



    }
}