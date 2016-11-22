//Team BlackJack - Adeebur Rahman, Elvin Hwang, Haiyao Liu
//APCS1 pd3
//HW32 -- Ye Olde Role Playing Game, Expanded .
//2016-11-20

/*=============================================
  class Mage -- a protagonist of Ye Olde RPG
  =============================================*/
 
public class Mage extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Mage() {
	_hitPts = 75;
	_strength = 100;
	_defense = 10;
	_attack = 1;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Mage( String name ) {
	this();
	_name = name;
    }
    
    //prepare a Mage for a special attack
    public void specialize() {
	_attack = 1.2;
	_defense = 5;
    }

    //revert to normal mode
    public void normalize() {
	_attack = 1;
	_defense = 10;
    }

    public  String about() {
	return "Mage: a strong attacker with weak defense and health";
    }
    
}//end class Mage

