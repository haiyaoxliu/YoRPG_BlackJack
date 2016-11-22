//Team BlackJack - Adeebur Rahman, Elvin Hwang, Haiyao Liu
//APCS1 pd3
//HW32 -- Ye Olde Role Playing Game, Expanded .
//2016-11-20

/*=============================================
  class Shrek -- troll of Ye Olde RPG
 
 
    SSSSSSSSSSSSSSS hhhhhhh                                                   kkkkkkkk
  SS:::::::::::::::Sh:::::h                                                   k::::::k
 S:::::SSSSSS::::::Sh:::::h                                                   k::::::k
 S:::::S     SSSSSSSh:::::h                                                   k::::::k
 S:::::S             h::::h hhhhh      rrrrr   rrrrrrrrr       eeeeeeeeeeee    k:::::k    kkkkkkk
 S:::::S             h::::hh:::::hhh   r::::rrr:::::::::r    ee::::::::::::ee  k:::::k   k:::::k
  S::::SSSS          h::::::::::::::hh r:::::::::::::::::r  e::::::eeeee:::::eek:::::k  k:::::k
   SS::::::SSSSS     h:::::::hhh::::::hrr::::::rrrrr::::::re::::::e     e:::::ek:::::k k:::::k
     SSS::::::::SS   h::::::h   h::::::hr:::::r     r:::::re:::::::eeeee::::::ek::::::k:::::k
        SSSSSS::::S  h:::::h     h:::::hr:::::r     rrrrrrre:::::::::::::::::e k:::::::::::k
             S:::::S h:::::h     h:::::hr:::::r            e::::::eeeeeeeeeee  k:::::::::::k
             S:::::S h:::::h     h:::::hr:::::r            e:::::::e           k::::::k:::::k
 SSSSSSS     S:::::S h:::::h     h:::::hr:::::r            e::::::::e         k::::::k k:::::k
 S::::::SSSSSS:::::S h:::::h     h:::::hr:::::r             e::::::::eeeeeeee k::::::k  k:::::k
 S:::::::::::::::SS  h:::::h     h:::::hr:::::r              ee:::::::::::::e k::::::k   k:::::k
  SSSSSSSSSSSSSSS    hhhhhhh     hhhhhhhrrrrrrr                eeeeeeeeeeeeee kkkkkkkk    kkkkkkk
 
  =============================================*/

public class Shrek extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Shrek() {
	_hitPts = 10000;
	_strength = 1000;
	_defense = 100;
	_attack = 10;
	_defenseNorm = _defense;
	_attackNorm = _attack;
	_type = "Troll";
    _catchphrase = "You and what army?";
    }

    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Shrek( String name ) {
	this();
	_name = name;
    }
    
    public Shrek( String name, String catchphrase ) {
        this(name);
        _catchphrase = catchphrase;
    }
    
    public int getDefense() {
        System.out.println("What defense? \"Ogres have layers... You get it?\"");
        return _defense;
    }
    
    public void lowerHP( int dmg ) {
        System.out.println("I took damage? \"Like THAT's ever gonna happen! What a load of...\"");
    }
    
    public void specialize() {
        System.out.println("\"This is the part where you run away,\" monster.");
    }
    
    public void normalize() {
        
    }
    
    public String about() {
        return "Go away!";
    }


}//end class Shrek

