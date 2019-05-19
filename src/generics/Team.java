package generics;

import java.util.ArrayList;

/* Precisamos implementar uma classe T que possui uma lista de P.
 * É necessário que esta lista de P seja composta de uma especialização específica de P
 * Não devemos deixar que outra especialização de P seja usada para compor a lista de P
 * Para problemas similares, o conceito de Generics pode ser utilizado
 */
public class Team<P extends Player> implements Comparable<Team <P>> {
	
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private ArrayList<P> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(P player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " já está neste time.");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " contratado pelo time " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<P> opponent, int ourScore, int theirScore) {

        String message;

        if(ourScore > theirScore) {
            won++;
            message = " ganhou de ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " empatou com ";

        } else {
            lost++;
            message = " perdeu para ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 3) + tied;
    }

    // implements comparable
	@Override
	public int compareTo(Team<P> team) {
		if (this.ranking() > team.ranking()) {
			return -1;
		}
		else if (this.ranking() < team.ranking()) {
			return 1;
		}
		return 0;
	}

}
