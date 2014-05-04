puts "Enter your name: "
name = gets.chomp
puts "Enter your last name: "
lname = gets.chomp
puts "Enter your username: "
username = gets.chomp
puts "Enter your password: "
password = gets.chomp

puts "Your full name is: " + name.capitalize + " " + lname.capitalize
puts "Your username is: " + username.gsub(/[aeiou]/, '%')
puts "An extract of your password is: " + password.reverse[0..2]