package controller;

public class UserController {
@PostMapping
public User createUser(User user) {
	return user;
}
@GetMapping
public List<Users> getAllUser()
{
	return user.findAll();
	}}
