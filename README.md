# Bootjpa
JPA/MVC/REST

This project uses java persistence api and spring mvc to perform various REST operations like -
C - Create
R - Read
U - Update
D - Delete

JPA 
It is a specification which specifies how to access, manage and persist information between java objects and relational databases.

Various annotations used here are-

@PathVariable 
This is used to pass value in the formal parameter from the url containing value of the key 
Like /alien/102
Where 102 is the aid
Syntax – @RequestMapping(“/alien/{aid}”)
Public String getAlien(@PathVariable(“aid”) int aid)
So value will be passed from the url to the aid in the function 

@GetMapping
This is used to add get mapping to the url. We can also do it by adding method property in @RequestMapping annotation but working with rest this annotation is preferred.

@PostMapping
This annotation is used to add post mapping to the url.

@DeleteMapping
This annotation is used to  add delete mapping to the url.
@PutMapping
This annotation is used to add put mapping to the url.

@RequestBody 
This annotation is a must to accept the data in json format and map it into the java object.

@GeneratedValue
This annotation is used to automatically assign values to the primary key.
@RepositoryRestResource 

This annotation is used to create repository rest resource and provide basic crud operation functionality. This sets up data rest.





This project uses embedded tomcat server and h2 database
Any REST API client can be used.
