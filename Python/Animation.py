import time
import os

def animate_typing(text):
  """Menganimasikan teks dengan efek mengetik karakter per karakter.

  Args:
    text: Teks yang akan dianimasikan.
  """

  for line in text.splitlines():
    for char in line:
      print(char, end='', flush=True)
      time.sleep(0.0001)  # Jeda 0.05 detik untuk setiap karakter
    print()
    time.sleep(0.1)  # Jeda 1 detik sebelum baris berikutnya

# Teks yang ingin dianimasikan
text = """
                                                    ::     .:                                                 
                                          .7^      .JY    .57J                                                
                                          ~YJ      7?Y     Y?~                                                
                                           YJ      7#^    .Y?                                                 
                                          ^5P!    !J?P.   Y!!P~                                               
                                          ~5?5    ?Y7G:   P?7B^                                               
                                          ^5~Y.   7P!P:   PJ!B:                                               
                                          ~5^Y^:::?P7G7^^^5J?G7~~^                                            
                                       ^77!^:^~^^^^^:^^^::::::^^:J?                                           
                                       Y~^^^~^:~~~~^^~!!~~!!!7!!?5^                                           
                                       .?5::^~~^..:^^: .^:. ::  ~Y                                            
                                        !!                      :Y                                            
                                        J!                       P                                            
                                    ^!7757^~~~~~~~~~~~~~~~~~~~~~!P?!~^.                                       
                                   J!:.  .....:::::::::::::::::::.:::~5^                                      
                                   5J!7!~!!!!~~~~!!!7777777777!!!!!~JJ7:                                      
                                   Y~ .::...:..                     J7                                        
                                   Y:                               ?!                                        
                                   Y:                               ?!                                        
                                   P:                               ?7                                        
                              ^!!~~P?!777!!!!!!!!!!!!!!!!!!!!!!~~~~^YY~!!~:                                   
                             !Y:~~:.:^:  .:^^...:^^. .::....::::::::::^:::Y~                                  
                             .!P~~!!~~!77!~^~~!!77!~:~!!!!!!!!!7!~^~77!~7J?^                                  
                               P                                        .P.                                   
                               P.                                        Y.                                   
                               5:                                        5:                                   
                               ??~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^P:                                   
                                .....:::::::::::^^^^^^^^^^^^^^^^^^^^^^^^^:                                    
                                          .                   ..     :.   ..                                  
                            :?~7. !7!7  ~7~J7.  .?~7?!!!~ :7!J???!. Y^!!.!!!7                                 
                            7? !? Y. Y^.5. 7?7! :J .5!7^!?~? ^J.7?? 5: ^5: ^Y                                 
                            !? ^5~JJ ?~77  Y?~J! Y  ?7?!7~:Y  Y7??~ :?^~Y !7.                                 
                            7? ^5^Y! Y^5. !5Y?.5 5: J!^:.  5. 57~.    5J~Y~                                   
                            ~J.7! Y^!?.P^!? 77^J ?7~J      ?77!       Y:^J                                    
                             ^~^  .^:  .^:   :^.  ^^        ^:        :~^.                                    
                                   ....    .....                                 ::    .   :^:                
                   ?!7!!~:   ~?7  !7Y777^77~^^~!7.:?!!  ^77.  !^!7~!!:    :!~7. ~?~? ^!~J.7!:^?               
                  ^Y ^J~?J.  ???. J.!J~?J^^77:J~: 7! Y^ Y.77 ~? :J.:~?7. ^?. YJ !7 ??^:!~^Y   Y.              
                  ~J  J!7Y~.:J ^? J..G?7^  !~ !~  J: Y!^J!:? ?^ ^J   ^?7^?  J^~7 ?!J7~~. ~J  7~               
                  ^J  ?7^?7?~J ~7 J ~57?.  ~? ?~  Y.:5^^Y~:? J. ?~  :7??? :JJJ Y.!7:5.   .J:!7                
                  .Y..Y^:7??:Y.J: Y~?.?7?  .Y:J   J^J:  !77! Y:~Y~~!77~J^~7^^J 7!Y.7!     !?7                 
                   ^~!!~!~^. ^7^  ~!. .^.   ^7:   ^!.    ~~  ^!?~~~^:  !~:   :!!:~!~      7!7                 
                                                                                                              
                                                                                                              
"""

animate_typing(text)