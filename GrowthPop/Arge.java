class Arge{
  public static int nbYear(int p0, double percent, int aug, int p) {
    if(p0 < 0 || p < 0 || percent < 0)
      return -1;
  
    int years = 0;
    while(p0 < p){
        p0 += p0*(percent/100) + aug;
        years++;
    }
    return years;
  }
}