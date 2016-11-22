//Team BlackJack - Adeebur Rahman, Elvin Hwang, Haiyao Liu
//APCS1 pd3
//HW32 -- Ye Olde Role Playing Game, Expanded .
//2016-11-20

/*=============================================
  class Gladiator -- a protagonist of Ye Olde RPG
  =============================================*/
 
public class Gladiator extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Gladiator() {
	_hitPts = 135;
	_strength = 100;
	_defense = 40;
	_attack = .3;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Gladiator( String name ) {
	this();
	_name = name;
    }

    //prepare a Gladiator for a special attack
    public void specialize() {
	_attack = .6;
	_defense = 20;
    }

    //revert to normal mode
    public void normalize() {
	_attack = .3;
	_defense = 40;
    }

    //returns string about Gladiator
    public String about() {
	return "Gladiator: Similar to warriors, but with more health and less attack";
    }
}//end class Gladiator

