def list = [1, 2, 3, 4, 5]

println list.sum()

def newList = list.collect { it * 2 }

println newList.sum()
println list.sum()