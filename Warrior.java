//Team BlackJack - Adeebur Rahman, Elvin Hwang, Haiyao Liu
//APCS1 pd3
//HW32 -- Ye Olde Role Playing Game, Expanded .
//2016-11-20

/*=============================================
  class Warrior -- a protagonist of Ye Olde RPG
                          (_)           
  __      ____ _ _ __ _ __ _  ___  _ __ 
  \ \ /\ / / _` | '__| '__| |/ _ \| '__|
   \ V  V / (_| | |  | |  | | (_) | |   
    \_/\_/ \__,_|_|  |_|  |_|\___/|_|   
  =============================================*/
 
public class Warrior extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Warrior() {
	_hitPts = 125;
	_strength = 100;
	_defense = 40;
	_attack = .4;
	_defenseNorm = _defense;
	_attackNorm = _attack;
	_type = "Warrior";
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Warrior( String name ) {
	this();
	_name = name;
    }

}//end class Warrior

