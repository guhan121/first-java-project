public enum EyeColor {
   
   BLUE("Blue"),
   GREEN("Green"),
   BROWN("Brown"),
   GRAY("Gray"),
   GOLD("Gold"),
   BLACK("Black");
   
   private String description;
   
   private EyeColor(String description) {
      this.description = description;
   }
   
   public String getDescription() {
      return description;
   }

}