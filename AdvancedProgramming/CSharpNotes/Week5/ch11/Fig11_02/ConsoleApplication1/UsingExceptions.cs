// UsingExceptions.cs
// Using finally blocks.

using System;

namespace UsingExceptions
{
   // demonstrating that finally always executes
   class UsingExceptions
   {
      // entry point for application
      static void Main( string[] args )
      {
         // Case 1: No exceptions occur in called method.
         Console.WriteLine( "Calling DoesNotThrowException" );
         DoesNotThrowException();

         // Case 2: Exception occurs and is caught 
         // in called method.
         Console.WriteLine( "\nCalling ThrowExceptionWithCatch" );
         ThrowExceptionWithCatch();

         // Case 3: Exception occurs, but not caught
         // in called method, because no catch blocks.
         Console.WriteLine( 
            "\nCalling ThrowExceptionWithoutCatch" );

         // call ThrowExceptionWithoutCatch
         try 
         {
            ThrowExceptionWithoutCatch();
         }

            // process exception returned from 
            // ThrowExceptionWithoutCatch
         catch 
         {
            Console.WriteLine( "Caught exception from " + 
               "ThrowExceptionWithoutCatch in Main" );
         }

         // Case 4: Exception occurs and is caught
         // in called method, then rethrown to caller.
         Console.WriteLine( 
            "\nCalling ThrowExceptionCatchRethrow" );

         // call ThrowExceptionCatchRethrow
         try 
         {
            ThrowExceptionCatchRethrow();
         }

            // process exception returned from 
            // ThrowExceptionCatchRethrow
         catch
         {
            Console.WriteLine( "Caught exception from " + 
               "ThrowExceptionCatchRethrow in Main" );
         }

      } // end method Main

      // no exceptions thrown
      public static void DoesNotThrowException()
      {
         // try block does not throw any exceptions 
         try 
         {
            Console.WriteLine( "In DoesNotThrowException" );
         }

            // this catch never executes
         catch
         {
            Console.WriteLine( "This catch never executes" );
         }

            // finally executes because corresponding try executed
         finally
         {
            Console.WriteLine( 
               "Finally executed in DoesNotThrowException" );
         }

         Console.WriteLine( "End of DoesNotThrowException" );

      } // end method DoesNotThrowException

      // throws exception and catches it locally
      public static void ThrowExceptionWithCatch()
      {
         // try block throws exception
         try 
         {
            Console.WriteLine( "In ThrowExceptionWithCatch" );
            
            throw new Exception( 
               "Exception in ThrowExceptionWithCatch" );
         }

            // catch exception thrown in try block
         catch ( Exception error )
         {
            Console.WriteLine( "Message: " + error.Message );
         }

            // finally executes because corresponding try executed
         finally
         {
            Console.WriteLine( 
               "Finally executed in ThrowExceptionWithCatch" );
         }

         Console.WriteLine( "End of ThrowExceptionWithCatch" );

      } // end method ThrowExceptionWithCatch

      // throws exception and does not catch it locally
      public static void ThrowExceptionWithoutCatch()
      {
         // throw exception, but do not catch it
         try 
         {
            Console.WriteLine( "In ThrowExceptionWithoutCatch" );

            throw new Exception( 
               "Exception in ThrowExceptionWithoutCatch" );
         }

            // finally executes because corresponding try executed
         finally
         {
            Console.WriteLine( "Finally executed in " +
               "ThrowExceptionWithoutCatch" );
         }

         // unreachable code; would generate logic error 
         Console.WriteLine( "This will never be printed" );

      } // end method ThrowExceptionWithoutCatch

      // throws exception, catches it and rethrows it
      public static void ThrowExceptionCatchRethrow()
      {
         // try block throws exception
         try 
         { 
            Console.WriteLine( "In ThrowExceptionCatchRethrow" );

            throw new Exception( 
               "Exception in ThrowExceptionCatchRethrow" );
         }

            // catch any exception, place in object error
         catch ( Exception error )
         {
            Console.WriteLine( "Message: " + error.Message );

            // rethrow exception for further processing
            throw error;  

            // unreachable code; would generate logic error
         }

            // finally executes because corresponding try executed
         finally 
         {
            Console.WriteLine( "Finally executed in " +
               "ThrowExceptionCatchRethrow" );
         }

         // unreachable code; would generate logic error 
         Console.WriteLine( "This will never be printed" );

      } // end method ThrowExceptionCatchRethrow

   } // end class UsingExceptions
}


