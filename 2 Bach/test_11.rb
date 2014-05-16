print "Enter value for a: "
a = gets.chomp
print "Enter value for b: "
b = gets.chomp

a_i = a.to_i
b_i = b.to_i

c = 0

while a != 0 # until a == 0
    c += a + b
    puts c
    a = a - 1
    b = b + 2
end
