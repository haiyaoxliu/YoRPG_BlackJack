//Team BlackJack - Adeebur Rahman, Elvin Hwang, Haiyao Liu
//APCS1 pd3
//HW32 -- Ye Olde Role Playing Game, Expanded .
//2016-11-20

/*=============================================
  class Character -- superclass for combatants in Ye Olde RPG
  =============================================*/

public class Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected int _hitPts;
    protected int _strength;
    protected int _defense;
    protected int _defenseNorm;
    protected double _attack;
    protected double _attackNorm;
    protected String _name;
    protected String _type;
    protected String _catchphrase;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Character() {
	_hitPts = 125;
	_strength = 100;
	_defense = 40;
	_attack = .4;
	_defenseNorm = _defense;
	_attackNorm = _attack;
	_name = "J. Doe";
	_type = "Default Character";
    }

    public Character(String name) {
	this();
	_name = name;
    }
    
    public Character(String name, String catchphrase) {
        this(name);
        _catchphrase = catchphrase;
        
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public int getDefense() { return _defense; }

    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    /*=============================================
      boolean isAlive() -- tell whether I am alive
      post: returns boolean indicated alive or dead
      =============================================*/
    public boolean isAlive() {
	return _hitPts > 0;
    }


    /*=============================================
      int attack(Character) -- simulates attack on a Monster
      pre:  Input not null
      post: Calculates damage to be inflicted, flooring at 0. 
      Calls opponent's lowerHP() method to inflict damage. 
      Returns damage dealt.
      =============================================*/
    public int attack( Character opponent ) {

	int damage = (int)( (_strength * _attack) - opponent.getDefense() );
	//System.out.println( "\t\t**DIAG** damage: " + damage );

	if ( damage < 0 )
	    damage = 0;

	opponent.lowerHP( damage );

	return damage;
    }//end attack


    /*=============================================
      void lowerHP(int) -- lowers life by input value
      pre:  Input >= 0
      post: Life instance var is lowered by input ammount.
      =============================================*/
    public void lowerHP( int damageInflicted ) {
	_hitPts = _hitPts - damageInflicted;
    }

    //prepare a Character for a special attack
    public void specialize() {
	_attack = 2 * _attackNorm;
	_defense = _defenseNorm / 2;
    }

    //revert to normal mode
    public void normalize() {
	_attack = _attackNorm;
	_defense = _defenseNorm;
    }

    //returns a String describing a Character
    public String about() {
	String retStr = "";
	retStr += "--------------------------\n";
	retStr += "Character Info\n";
	retStr += "Type: " + _type + "\n";
	retStr += "Name: " + getName() + "\n";
	retStr += "HitPts: " + _hitPts + "\n";
	retStr += "Strength: " + _strength + "\n";
	retStr += "Defense: " + getDefense() + "\n";
	retStr += "Attack: " + _attack + "\n";
	retStr += "--------------------------\n";
	return retStr;
    }
}//end class Character
