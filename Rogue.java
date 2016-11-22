//Team BlackJack - Adeebur Rahman, Elvin Hwang, Haiyao Liu
//APCS1 pd3
//HW32 -- Ye Olde Role Playing Game, Expanded .
//2016-11-20

/*=============================================
  class Rogue -- a protagonist of Ye Olde RPG
  =============================================*/
 
public class Rogue extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Rogue() {
	_hitPts = 90;
	_strength = 100;
	_defense = 10;
	_attack = .8;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Rogue( String name ) {
	this();
	_name = name;
    }

    //prepare a Rogue for a special attack
    public void specialize() {
	_attack = 1;
	_defense = 5;
    }

    //revert to normal mode
    public void normalize() {
	_attack = .8;
	_defense = 10;
    }

    public String about() {
	return "Rogue: Similar to Mages, but with more health and less attack";
    }
    
}//end class Rogue

