
import ia.battle.camp.FieldCell;
import ia.battle.camp.actions.Move;

import java.util.ArrayList;

public class MatadorMove extends Move {
       
        private ArrayList<FieldCell> movimientos;
       
        public MatadorMove() {
                movimientos = new ArrayList<FieldCell>();
        }
       
        public void setMovimientos(ArrayList<FieldCell> movimientosAHacer) {
                movimientos = movimientosAHacer;
        }
       
        @Override
        public ArrayList<FieldCell> move() {
                return movimientos;
        }

}
