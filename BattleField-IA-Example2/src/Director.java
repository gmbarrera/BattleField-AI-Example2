import ia.battle.camp.Warrior;
import ia.battle.camp.WarriorManager;
import ia.exceptions.RuleException;

public class Director extends WarriorManager {

        @Override
        public String getName() {
                return "El couch";
        }

        @Override
        public Warrior getNextWarrior() throws RuleException {

                Matador m = new Matador("Juana de Arco Reloaded", 60, 10, 10, 10, 10);

                return m;
        }

}
