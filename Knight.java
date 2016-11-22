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
	_hitPts = 125;
	_strength = 100;
	_defense = 40;
	_attack = .5;
	_defenseNorm = _defense;
	_attackNorm = _attack;
	_type = "Knight";
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

}//end class Knight

