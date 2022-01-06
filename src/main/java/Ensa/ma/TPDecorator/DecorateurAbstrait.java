package Ensa.ma.TPDecorator;

public abstract class DecorateurAbstrait implements ComposantAbstrait {

protected ComposantAbstrait composantAbstrait;

public DecorateurAbstrait(ComposantAbstrait composantAbstrait) {
this.composantAbstrait = composantAbstrait;
}

}
