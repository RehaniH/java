package abstract_methods;

public enum Month {

	JANUARY {
		@Override
		public Integer getNumbericalMonthValue() {
			return 1;
		}
	}, FEBRUARY {
		@Override
		public Integer getNumbericalMonthValue() {
			return 2;
		}
	}, MARCH {
		@Override
		public Integer getNumbericalMonthValue() {
			return 3;
		}
	}, APRIL {
		@Override
		public Integer getNumbericalMonthValue() {
			return 4;
		}
	};
	
	public abstract Integer getNumbericalMonthValue();
}
