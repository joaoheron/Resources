package interfaces;

import java.util.List;

public interface ITelephone {
	// Define os metodos que serao implementados nas classes que implements this interface
	// Podemos criar metodos que tratam classes que implementam a interface ITelephone, sem saber quais sao essas classes
	// Faz apenas declaracoes, nao faz implementacoes
	// Todos metodos sao automaticamente public abstract
	// declara variaveis apenas static e final
	// Nao suporta construtores
	
	static final long constante = 1111L;
	List write(); // nao precisa especificar qual tipo de lista(arraylist, linkedlist)
	// e nem do que esta lista eh composta (<String>, <Phone>, etc)
	void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int PhoneNumber);
	boolean isRinging();
	
	// a partir do java 8 interfaces podem ter DEFAULT methods, que sao implementados dentro dela mesma
	default boolean retornaTrue() {
		return true;
	}
	// a partir do java 9 interfaces podem ter private methods
}
