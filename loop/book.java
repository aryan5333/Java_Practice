/** @author Aryan sinha
 * @version 2.0
 * @since 2015
**/
package loop;

/**
 * 
 * @author aryan sinha
 * 
 * class for library Book
 */
public class book{
    /**
     * @value 10 default value
     */
    static int val=10;

    /**
     * Parameterized constructor
     * @param s Book Name
     */

     public book(String s)
     {

     }
     /**
      * Issue a Book to a Student
      *@param roll roll number of a student
      *@throws Exception if book is not available,throws Exception

      */
      public void issue(int roll)throws Exception
      {

      }
      /**
       * Check if book is available
       * @param str Book Name
       * @return if book is available returns true else false
       */
      public Boolean available(String str)
      {
        return true;
      }
      /**
       * Get book name
       * @param id book id
       * @return return book name
       */
      public String getName(int id)
      {
        return "";
      }
}