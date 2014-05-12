require 'mathn'

print "Enter the lower boundary: "
lower =  gets.chomp
low = lower.to_i
print "Enter the upper boundary: "
upper = gets.chomp
upp = upper.to_i

primes = []

# Option 1 - Using mathn module (easier)

low.upto(upp) do |i|
    if Prime.prime? i
        primes << i
    end
end

puts primes.to_s
