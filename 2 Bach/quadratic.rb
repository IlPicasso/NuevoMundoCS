puts "Input value for A:"
a_s = gets.chomp
puts "Input value for B:"
b_s = gets.chomp
puts "Input value for C:"
c_s = gets.chomp

a = a_s.to_i
b = b_s.to_i
c = c_s.to_i

sqrt = b**2-(4*a*c)
numerator1 = -b+Math.sqrt(sqrt)
numerator2 = -b-Math.sqrt(sqrt)
x1 = numerator1/(2*a)
x2 = numerator2/(2*a)

puts "Value for x1 = #{x1} and x2 = #{x2}"
