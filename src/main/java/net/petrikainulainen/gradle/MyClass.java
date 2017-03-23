
public class MyClass {
// Other possible stuff... ignore...
  public <E> String formatArray(E[] arrayToFormat) {
    StringBuilder sb = new StringBuilder();
 
    int index = 0;
    for (E element : arrayToFormat) {
      sb.append("Element ");
      sb.append(index++);
      sb.append(" => ");
      sb.append(element);
      sb.append('\n');
    }
 
    return sb.toString();
  }
// More possible stuff... ignore...
}