//Team BlackJack - Adeebur Rahman, Elvin Hwang, Haiyao Liu
//APCS1 pd3
//HW32 -- Ye Olde Role Playing Game, Expanded .
//2016-11-20

/*=============================================
  class Knight -- a protagonist of Ye Olde RPG
  =============================================*/
 
public class Knight extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Knight() {
	_hitPts = 115;
	_strength = 100;
	_defense = 40;
	_attack = .5;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Knight( String name ) {
	this();
	_name = name;
    }

    //prepare a Knight for a special attack
    public void specialize() {
	_attack = .8;
	_defense = 20;
    }

    //revert to normal mode
    public void normalize() {
	_attack = .5;
	_defense = 40;
    }

    //returns string about Knight
    public String about() {
	return "Knight: Similar to warriors, but with more less health and more attack";
    }
    
}//end class Knight

