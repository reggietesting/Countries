

public class Country
{
  private String name;
  private String capital;
  private String countryLanguage;
  private String image;

  public Country (String name, String capital, String countryLanguage, String image) {
   this.name  = name;
   this.capital = capital;
   this.countryLanguage = countryLanguage;
   this.image = image;
  }

  public Country() {
    
  }

  public String getName() {
    return this.name;
  }

  public String getCapital() {
    return this.capital;
  }

  public String getLanguage() {
    return countryLanguage;
  }

  public String getImage() {
    return image;
  }

  public String tostringMethod() {
    return "The countries name is : " + name + ".\nThe countries capital is : " + capital + ".\nThe countries language is : " + countryLanguage + ".\nThe countries image is : " + image + ".";
  }



  // add private instance variables for the name, capital, language, and image file.

  // add constructors

  // Write accessor/get methods for each instance variable that returns it.

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 


  
}