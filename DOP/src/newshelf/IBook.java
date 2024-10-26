package newshelf;

import oldshelf.FictionType;

public sealed interface IBook permits Comic, Fiction, TextBook {

}

record Comic(String title,int ageOfMainCharacter) implements IBook{

}

record Fiction(String name, FictionType f) implements IBook{
    
}

record TextBook(String subject) implements IBook{

}
